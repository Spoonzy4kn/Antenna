# Roadmap

**Project:** Antenna  
**Status:** Draft  
**Version:** 0.1  
**Last Updated:** 30 June 2026

---

## 1. Purpose

This roadmap defines the staged path from documentation-first planning to Version 1 foundation.

The roadmap is directional and should be updated as implementation decisions are made.

---

## 2. Phase 0: Documentation foundation

Status: current.

Deliverables:

- Vision.
- Project principles.
- Scope of works.
- Functional requirements.
- Non-functional requirements.
- Decision log.
- UI/UX specification.
- Architecture.
- Supporting professional documentation.

Exit criteria:

- Documentation is committed.
- Open questions are visible.
- Implementation backlog can be created.

---

## 3. Phase 1: Android project skeleton

Deliverables:

- Native Android project.
- Kotlin configuration.
- Jetpack Compose setup.
- Gradle setup.
- App package/application ID selected.
- Basic theme.
- Primary navigation shell.
- Placeholder Home, Search, Explore, My Subs, Settings screens.

Exit criteria:

- App builds from source.
- App launches on emulator/device.
- Main navigation works.
- README build instructions are accurate.

---

## 4. Phase 2: Local data foundation

Deliverables:

- Local favourites storage.
- My Subs screen.
- Add/remove local favourite.
- Theme setting.
- NSFW visibility setting.
- Settings structure.
- Privacy copy.

Exit criteria:

- User can manage My Subs without account login.
- Local settings persist.
- NSFW is hidden/restricted by default.

---

## 5. Phase 3: Platform access foundation

Deliverables:

- Selected Reddit-compatible access method.
- Network layer.
- Data mapping layer.
- Community open flow.
- Community feed.
- Post preview model.
- Error/restricted/rate-limit handling.

Exit criteria:

- User can open supported public community content.
- Platform failures map to clear user-facing states.

---

## 6. Phase 4: Post and comments

Deliverables:

- Post detail screen.
- Text/link/image post support where available.
- Comment loading.
- Nested comment rendering.
- Collapse/expand comments.
- Deleted/removed comment handling.

Exit criteria:

- User can open and read supported posts and comments.
- Large comment threads remain usable under normal conditions.

---

## 7. Phase 5: Search and Explore

Deliverables:

- Search screen implementation.
- Community search where supported.
- Post search where supported.
- Explore screen where supported.
- Sort/filter controls.

Exit criteria:

- Search and Explore are useful without clutter.
- Unsupported search/discovery features are not misrepresented.

---

## 8. Phase 6: Quality hardening

Deliverables:

- Unit tests for core logic.
- UI tests for critical flows where practical.
- Manual QA checklist completed.
- Accessibility spot checks.
- Privacy review.
- Performance review.
- Documentation review.

Exit criteria:

- No P0 release blockers.
- Privacy and accessibility checks pass.
- Documentation matches implementation.

---

## 9. Phase 7: Version 1 release

Deliverables:

- Version 1 feature set complete.
- Licence selected.
- Changelog updated.
- Release notes prepared.
- Repository tagged.
- Build artefact published if appropriate.

Exit criteria:

- Definition of done from scope document is satisfied.

---

## 10. Future candidates

Future features may include:

- Account login.
- Voting.
- Commenting.
- Posting.
- Reporting.
- Multi-account support.
- Offline reading.
- Backup and restore.
- Community grouping.
- Custom feeds.
- Advanced filtering.
- Tablet layouts.
- Additional platform compatibility.

These are not Version 1 commitments.
